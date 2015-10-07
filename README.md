# pgwt-showcase

<br/>

Showcase project for the [pgwt library](https://github.com/LuxActive/pgwt) Polymer 1.0 Gwt library.

<br/>

## 1. Supported elements
As of this moment the following Elements are supported. Elements will be added and existing updated.

| Element		| Version	|
| --------		| -------- 	|
| paper-button	| 1.0.7		|
| iron-icons	| 1.0.3		|
| paper-card	| 1.0.5		|
| paper-icon-button	| 1.0.3		|
| paper-drawer-panel	| 1.0.3		|
| paper-input	| 1.0.14		|

<br/>
Some functionality is not implemented yet!

## 2. Installation
1. Checkout and install [pgwt](https://github.com/LuxActive/pgwt)
2. Checkout the showcase.
3. Import the project as maven project (Eclipse)
4. Call **bower install** on src/main/webapp/bower.json
5. Refresh the src folder structure in Eclipse after the bower installation finished.
5. Make sure under Properties - (Google Classic) - Web Application - This project has a WAR directory is checked and pointing to src/main/webapp
5. Run the showcase like any gwt project. (An empty page should be displayed)
6. Stop the Server.
7. Edit the Run Configurations... - Arguments and add  **-XjsInteropMode JS** 
8. Start the showcase again and now you should see the Polymer elements.