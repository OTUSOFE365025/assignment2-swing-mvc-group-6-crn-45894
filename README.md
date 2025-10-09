[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)
Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.

Swing is an API that provides libraries to help create GUI elements for Java programs. It is part of the Java Foundation Classes (JFC), a set of frameworks used for creating Java GUIs. Swing's design is rooted in the model-view-controller pattern and it doesn't rely on the native OS GUI components, meaning that it is able to operate on its own (i.e. platform-independent). This makes it a more lightweight framework compared to AWT, another foundational JFC class. Swing is very modular and extensible, allowing develoeprs to implement custom components from specified frameworks. Swing is also an event-driven program, meaning it reacts to user events such as clicking or keyboard input dynamically.


The swing assignment code implements MVC by seperating the project into three different components, a model that manages the data, a view that displays this info to the user through the swing GUI, and controllers that handles user actions like scanning items. The project also use observers to notify the view of any changes which allows view to update itself in response. This is not exactly like the standard MVC pattern because the project does not directly communicate with the view this makes the layers less dependent on eachother unlike a standard MVC. 



Member responsibilities
Colton Task 1-4
Nabhil Task 1-4
Ammeer Task 1-4
