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

    Following property explanations can be found from here: http://api.mongodb.org/java/2.0/com/mongodb/MongoOptions.html

  - 'autoConnectRetry', 'connectionsPerHost', 'connectTimeout', 'maxWaitTime', 'socketTimeout', 'threadsAllowedToBlockForConnectionMultiplier'


* Required dependencies (to be copied to "/repository/components/lib"):-

  - mongo-java-driver (http://repo1.maven.org/maven2/org/mongodb/mongo-java-driver/2.9.1/mongo-java-driver-2.9.1.jar)
  - jongo (http://repo1.maven.org/maven2/org/jongo/jongo/0.3/jongo-0.3.jar)
  - jackson-core (http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.0.6/jackson-core-2.0.6.jar)
  - jackson-databind (http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.0.6/jackson-databind-2.0.6.jar)
  - jackson-annotations (http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.0.6/jackson-annotations-2.0.6.jar)
  - bson4jackson (http://repo1.maven.org/maven2/de/undercouch/bson4jackson/2.1.1/bson4jackson-2.1.1.jar)

* Built mongo-dss-connector can be found at:-

  - https://github.com/wso2/wso2-dss-connectors/blob/master/mongodb/downloads/ds-connector-mongodb-0.1.0-SNAPSHOT.jar?raw=true


