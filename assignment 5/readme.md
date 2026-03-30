⸻

🔹 Step 1: Create Project Structure
	1.	Create a folder:

assignment5

	2.	Inside it create:

index.jsp
success.jsp
RegisterServlet.java

	3.	Create folder:

WEB-INF

	4.	Inside WEB-INF, create:

classes
lib


⸻

🔹 Step 2: Prepare JSP Pages
	•	In index.jsp:
	•	Create a form to take employee details (name, email, salary)
	•	Set form action to call the servlet (/register)
	•	In success.jsp:
	•	Display a success message after data is inserted

⸻

🔹 Step 3: Prepare Servlet
	•	In RegisterServlet.java:
	•	Take input from form using request parameters
	•	Connect to MySQL using JDBC
	•	Insert data into employee table
	•	Redirect to success page

⸻

🔹 Step 4: Configure web.xml
	•	Create web.xml inside WEB-INF
	•	Map servlet name to URL pattern /register
	•	This connects JSP form to servlet

⸻

🔹 Step 5: Setup MySQL Database
	1.	Open terminal:

mysql -u root -p

	2.	Run:

CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    salary DOUBLE
);


⸻

🔹 Step 6: Download and Add MySQL JAR
	1.	Download MySQL Connector (Platform Independent ZIP)
	2.	Extract it
	3.	Copy .jar file
	4.	Paste inside:

assignment5/WEB-INF/lib/


⸻

🔹 Step 7: Compile Servlet
	1.	Open terminal
	2.	Navigate to project folder:

cd "/Users/ananya/Java-Assignments/assignment 5"

	3.	Compile servlet:

javac -cp ".:/Users/ananya/Desktop/apache-tomcat-9.0.116/lib/servlet-api.jar" RegisterServlet.java


⸻

🔹 Step 8: Move Class File
	•	After compilation, move:

RegisterServlet.class

👉 into:

WEB-INF/classes/


⸻

🔹 Step 9: Setup and Start Tomcat
	1.	Go to Tomcat folder:

cd ~/Desktop/apache-tomcat-9.0.116/bin

	2.	Start server:

./startup.sh


⸻

🔹 Step 10: Deploy Project

Copy your project into Tomcat:

cp -r "/Users/ananya/Java-Assignments/assignment 5" ~/Desktop/apache-tomcat-9.0.116/webapps/


⸻

🔹 Step 11: Start MySQL Server

mysql.server start

or mysql -u root -p


⸻

🔹 Step 12: Run Application

Open browser:

http://localhost:8080/assignment%205/index.jsp


⸻

🔹 Step 13: Test Application
	•	Enter employee details
	•	Submit form
	•	Success page should appear

⸻

🔹 Step 14: Verify Data in Database

USE employee_db;
SELECT * FROM employee;


⸻

🔥 IMPORTANT POINTS (REMEMBER)
	•	Servlet must be compiled → .class goes in WEB-INF/classes
	•	JAR must be inside WEB-INF/lib
	•	MySQL must be running before testing
	•	Use %20 if folder name has space
	•	Always restart Tomcat after changes

⸻

🎯 FLOW OF APPLICATION

index.jsp → Servlet → JDBC → MySQL → success.jsp

