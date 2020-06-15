# GST Calculator

GST Calculator is a simple	console	application, which	calculates the	GST	and	final selling price	for	a given	commodity.

# Features!

|GST Slabs | Descriptions  |
|---|---|
| 0%  |No	GST	is	applied	on	this	commodity   |
| 5%  |A	GST	of	5%	is	applied	on	top	of	this	commodity.   |
| 18%  |A	GST	of	18%	is	applied	on	top	of	this	commodity   |
| 28%  |A	GST	of	28%	is	applied	on	top	of	this	commodity      |

Product's for which this GST Calculator is valid with respective GST percentage
  - Food Grains (Rice, Wheat, Dal) --> 0%
  - Furnitures (Table, Sofa, Chair) --> 5%
  - Electronics (Mobile, TV, Tablet) --> 18%
  - Cosmetics (Cream, Perfume, Lotion) --> 28%
  
# What to change GST Slave ? 

In folder `src` get into package `com.gst.calculator` open the Java Class file `GST.java` update the GST Percentage slabs and update value of 
```
private static final int foodGrainGSTPercent = 0;
private static final int furnitureGSTPercent = 5;
private static final int electronicsGSTPercent = 18;
private static final int cosmeticsGSTPercent = 28;
```
# Want to add more products to application ? 

we can add that too under four categories as in file `GST.java` : - 

```
static List<String> foodGrainProducts = new ArrayList<String>() {
		{
			add("Rice");
			add("Wheat");
			add("Dal");
		}
	};
static List<String> furnitureProducts = new ArrayList<String>() {
		{

			add("Table");
			add("Sofa");
			add("Chair");
		}
	};

static List<String> electronicProducts = new ArrayList<String>() {
		{
			add("Mobile");
			add("TV");
			add("Tablet");
		}
	};

static List<String> cosmeticsProducts = new ArrayList<String>() {
		{

			add("Cream");
			add("Perfume");
			add("Lotion");
		}
	};

```
### Tech

GST Calculator is a console application made of :

* Java version 1.8.0_251

### Installation
Open in eclipse project and Run Configuration where pass the input as command line argument

