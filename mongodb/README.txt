* Custom Query Based Data Source Class: 'org.wso2.dss.connectors.mongodb.MongoDBDataSource'

* Data Source Properties :-

  - 'servers': A comma separate list of server hosts and ports.
     e.g.:-
      - "localhost"
      - "125.10.5.3, 125.10.5.4"
      - "192.168.3.1:27017, 192.168.3.2:27017"
  - 'database': The name of the database to connect.
  - 'write_concern': The write concern value as mentioned in "com.mongodb.WriteConcern".
  - 'read_preference": The read preference value as mentioned in "com.mongodb.ReadPreference".

* Required dependencies (to be copied to "/repository/components/lib"):-

  - mongo-java-driver (http://repo1.maven.org/maven2/org/mongodb/mongo-java-driver/2.9.1/mongo-java-driver-2.9.1.jar)
  - jongo (http://repo1.maven.org/maven2/org/jongo/jongo/0.2/jongo-0.2.jar)
  - jackson-core (http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.0.6/jackson-core-2.0.6.jar)
  - jackson-databind (http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.0.6/jackson-databind-2.0.6.jar)
  - jackson-annotations (http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.0.6/jackson-annotations-2.0.6.jar)

