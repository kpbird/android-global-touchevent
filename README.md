Android Detect Global Touch Event
=========================

Sidebar and Glovebox Apps become popular overnight because of only one functionality. They provide global menu which can be open from left or right edge of mobile screen.  As developer when I show this apps,first thing that comes in my mind was "NDK".  Then after I start looking for the solution.  Logically I figure out  that IF I can detect "Global onTouch Event" then It's posible to display side menu like sidebar or glovebox.

![Alt text](http://3.bp.blogspot.com/-Do1cGfuJoJg/UVbcRMDhSWI/AAAAAAAADz8/Lzbzzl8HXrc/s320/global_touch_image_1.png "Optional title")    ![Alt text](http://4.bp.blogspot.com/-MbGsUR6Nj_A/UVbcRBYvr5I/AAAAAAAADz4/oxgXV25Gvto/s320/global_touch_image_2.png "Optional title")    ![Alt text](http://1.bp.blogspot.com/-Xsqu4k8MjV8/UVbcRdi-I9I/AAAAAAAAD0E/nmyOdf7AKFA/s320/global_touch_image_3.png "Optional title")

Problem 1: Detect Global Touch Event 
Problem 2 : Display Sliding Menu.

Solution For Problem 1: 
1. Create service to detect touch event.
2. Fetch WindowManager object from system service
3. Create LinearLayout having 30 px width and fill_parent height
4. Add LinearLayout to WindowManager
5. set LinearLayout on left edge of screen / window.


Why I need to Service ? 
Because we can't get event when activity goes in background or close.

What if I make LinearLayout width more then 30 px ?
The control or activity which display in background will not get onTouch event.


