This project demonstrates how to configure, implement and use custom Work Item and their handlers.
They are used to execute custom logic specific for the given domain, and in jBPM / BPM Suite they are used much
more often than built-in Service Tasks.

The process consists of:
1. Creation of Work Item definition - which defines input, output and name

```
[
    "name" : "CheckStockStatus",
    "parameters" : [
      "ProductId" : new StringDataType(),
      "amount" : new IntegerDataType()
    ],
    "results" : [
        "inStock" : new BooleanDataType(),
    ],
    "displayName" : "CheckStockStatus",
    "icon" : "defaultlogicon.gif"
  ]
 ```
2. Implementation of the Work Item Handler - this is the logic, which will be invoked when the process arrives at our Work Item

```java

public class StockDBHandler implements java.io.Serializable, WorkItemHandler {

    public void	abortWorkItem(WorkItem workItem, WorkItemManager manager) {
       
       // no need to actually implement this
    }

public void	executeWorkItem(WorkItem workItem, WorkItemManager manager) {
    
    //this is how you can access input parameters
    String key = (String)workItem.getParameter("ProductId");
    Integer requestedAmount = (Integer) workItem.getParameter("amount");
    
    //decide whether requested product is on stock or not
    Boolean inStock = MockupStockDB.getStockStatus(key,requestedAmount);
        
    //this is how you can construct workitem output
    Map<String,Object> results = new HashMap<String,Object>();
    results.put("inStock",inStock);
    
    if (inStock) {
        System.out.println("Product:"+key+" is in stock and we will decrease the stock amount");
        MockupStockDB.decreaseStockStatus(key,requestedAmount);
    }
    else
        System.out.println("Product:"+key+" is not in stock");

//you always need to call complete method, otherwise your process will not proceed!
    manager.completeWorkItem(workItem.getId(), results);

}

}

```
3. Bind these two together in the deployment descriptor

![Deployment Descriptor](https://ctrlv.cz/shots/2017/04/09/GhUO.png)

In a real project, the WorkItemHandler implementation would be stored in a separate project! (jar) 
This jar would be added into the business-central via Artifact Repository and then added as a project dependency.
This is purely for demonstration purposes.