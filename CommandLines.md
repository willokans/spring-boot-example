##  (Spring boot)

### Postgress/Docker CLIs

```
Docker ps
```
- To list docker database

```
- Docker exec -it <name of dash. Bash
```
-   Allow shell command Line within the container

```
- pSql -U will_code					
```
- 	connect to a postgres database
```
Ctrl + d 							
```
- To get out of Postgres cli
```
Ctrl + l 							
```
- To clear the IntelliJ terminal
```
\l 								
```
- To list databases
```
\l c table name				
- ``` 
- To go to database table
```
\d <table>						
```
-  To see the table
```
CREATE DATABASE <NAME>			
```
- To create database
```
INSERT INTO customer(id, name, email, age)
VALUES (nextval('customer_id_sequence'), 'Alex', 'alex@alex.com', 22);
```