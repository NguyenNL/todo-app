# Demo Todo application
Create Sample ToDo application.

Every todo item should have todo title, Description about the item, Time of the event

Allow functionality to add new todo.
b.	Show list of all Todos.

c.	Update a Todo item.

d.	Delete a Todo item. 

e.	Delete multiple Todo item.

## Development

Before you can build this project, you must install and configure the following dependencies on your machine:

 [Node.js][]: We use Node to run a development web server and build the project.
   Depending on your system, you can install Node either from source or as a pre-packaged bundle.

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in [package.json](package.json).

    npm install
    

After installing Maven, you should be able to run the following command to install dependence.

    mvn dependency:resolve

We use npm scripts and [Webpack][] as our build system.

Run the following commands in two separate terminals to create a blissful development experience where your browser
auto-refreshes when files change on your hard drive.

    mvn spring-boot:run
    npm start
    
After that, Enter url http://localhost:8081/ to access application.

Note: Using H2 Db, you don't need install any database. Check H2 DB at url http://localhost:8080/h2-console 

## Build

    npm run build
    mvn -Dmaven.test.skip=true package
    
After that, you can check at url http://localhost:8080/ with font-end, back-end are same domain.




 
