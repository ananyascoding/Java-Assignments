1. Download extensions:
   Java extension Pack
   tomcat by microsoft

2. Download tomcat https://tomcat.apache.org/download-90.cgi
   Core - tar.gz(pgp,sha512)

3. (base) ananya@Ananyas-Laptop ~ % cd /Users/ananya/apache-tomcat-9.0.117/bin
   (base) ananya@Ananyas-Laptop bin % chmod +x \*.sh
   (base) ananya@Ananyas-Laptop bin % ./startup.sh
   Using CATALINA_BASE: /Users/ananya/apache-tomcat-9.0.117
   Using CATALINA_HOME: /Users/ananya/apache-tomcat-9.0.117
   Using CATALINA_TMPDIR: /Users/ananya/apache-tomcat-9.0.117/temp
   Using JRE_HOME: /opt/homebrew/opt/openjdk@17
   Using CLASSPATH: /Users/ananya/apache-tomcat-9.0.117/bin/bootstrap.jar:/Users/ananya/apache-tomcat-9.0.117/bin/tomcat-juli.jar
   Using CATALINA_OPTS:  
   Tomcat started.

---

./shutdown.sh
./startup.sh

4. http://localhost:8080

5. Donwload MySQL Connector https://dev.mysql.com/downloads/connector/j/

   Operating System: Platform Independent, ZIP Archive
   look for mysql-connector-j-8.0.xx.jar
   Put it in lib


6. make a folder names EmployeeApp in WebApps in TomCat

EmployeeApp/
 ├── index.jsp
 └── WEB-INF/
      ├── web.xml
      ├── classes/
      │    └── AddEmployeeServlet.class
      └── lib/
           └── mysql-connector-j-xxx.jar


index.jsp        - form for user input  
web.xml          - servlet configuration  
classes/         - compiled servlet (.class file)  
lib/             - MySQL JDBC driver  

7. Run addemployeeservlet

javac -cp ".:/Users/ananya/apache-tomcat-9.0.117/lib/servlet-api.jar" AddEmployeeServlet.java
ls

- move this into tomcat's WEB_INF classes folder





