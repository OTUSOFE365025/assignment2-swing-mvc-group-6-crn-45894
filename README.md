[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)
Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.

Swing is an API that provides libraries to help create GUI elements for Java programs. It is part of the Java Foundation Classes (JFC), a set of frameworks used for creating Java GUIs. Swing's design is rooted in the model-view-controller pattern and it doesn't rely on the native OS GUI components, meaning that it is able to operate on its own (i.e. platform-independent). This makes it a more lightweight framework compared to AWT, another foundational JFC class. Swing is very modular and extensible, allowing develoeprs to implement custom components from specified frameworks. Swing is also an event-driven program, meaning it reacts to user events such as clicking or keyboard input dynamically.

The Swing assignment code implements MVC by seperating the project into three different components: a model that manages the data, a view that displays this info to the user through the Swing GUI, and controllers that handles user actions such as saving names entered by the user and displaying messages. The controller directly notifies the model and the view of any changes, allowing the view to update itself in response. This is not exactly like the standard MVC pattern as described in the lecture notes because the model doesn't notify the view of any changes (i.e. by using the Observer pattern, as outlined in the notes). Instead, the controller has to update the view, acting as an intermediary for communcation between the two layers while the model takes on a more passive role.

Member responsibilities
Colton Task 1-4
Nabhil Task 1-4
Ammeer Task 1-4
