Feature: HomePage Testing Scenario

Background: 

Given User has logged in with the username as "admin123@yahoo.com" and password as "admin123" 

Scenario: All phones displayed scenario

When user clicks on the phones category
Then 7 phones are displayed
Then user gets all models 
|Samsung galaxy s6|
|Nokia lumia 1520|
|Nexus 6|
|Samsung galaxy s7|
|Iphone 6 32gb|
|Sony xperia z5|
|HTC One M9|
#|Sony vaio i5|
#|Sony vaio i7|



And user gets all prices
|$360|
|$820|
|$650|
|$800|
|$790|
|$320|
|$700|

And user gets all specifications

|The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded.  |
|The Nokia Lumia 1520 is powered by 2.2GHz quad-core Qualcomm Snapdragon 800 processor and it comes with 2GB of RAM.  |
|The Motorola Google Nexus 6 is powered by 2.7GHz quad-core Qualcomm Snapdragon 805 processor and it comes with 3GB of RAM. |
|The Samsung Galaxy S7 is powered by 1.6GHz octa-core it comes with 4GB of RAM. The phone packs 32GB of internal storage that can be expanded up to 200GB via a microSD card. |
|It comes with 1GB of RAM. The phone packs 16GB of internal storage cannot be expanded. As far as the cameras are concerned, the Apple iPhone 6 packs a 8-megapixel primary camera on the rear and a 1.2-megapixel front shooter for selfies. |
|Sony Xperia Z5 Dual smartphone was launched in September 2015. The phone comes with a 5.20-inch touchscreen display with a resolution of 1080 pixels by 1920 pixels at a PPI of 424 pixels per inch. |
|The HTC One M9 is powered by 1.5GHz octa-core Qualcomm Snapdragon 810 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage that can be expanded up to 128GB via a microSD card.  |



Scenario: All laptops displayed scenario

When user clicks on the laptops from categories
Then list of laptops are displayed
Then user gets the information for each laptop such as "model" and "price" and "specification"
















