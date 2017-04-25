This process shows how to implement multi instance sub process with as little coding as possible.

It also shows how to configure Human Task and its Form to produce List of values.

Note that Form Modeller doesn't allow you to *directly* produce List of items.

i.e. output variable of type List

What you can do instead, is wrap this list as a POJO attribute.
i.e.

```
public class Item {}

public class Order {
	
	List<Item> items;
}
```
And your task can produce object of type Order and this in turn, whill allow you to use Multiple SubForm for producing list of Items.

MI SubProcess needs to take input in form of list of values. So the one necessary line of code needed in this example is to provide this list.
We can do it in On Entry script of MI SubProcess like this:

```
kcontext.setVariable("mi_items",p_order.getItems());
```

