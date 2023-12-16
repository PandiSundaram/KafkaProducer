KAFKA
      - Open source distributed event streaming platform (create and process real time stream)
           event streaming - can handle millions of data from publisher and pass that to consumer
           distributed - run with multiple instance kafka server

WHY KAFKA
      1 -  Post man comes to the door, when you are not available we cannot get the post eventually, instant
      we can keep letter box with your home, so that you can get it
      When listener server down, Kafka has offset to read once listener back
      2 - when we have multiple system which is connected multiple system, we will having complexity to handle
      multiple connection (http,smtp,jdbc) and data format. so we can publish our data and consumer can get it by centralizing the data.

KAFKA COMPONENT

     - producer
     - consumer
     - cluster
     - broker (Kafka)
     - topic (contact/payment/order)
     - partisions
     - offset - help you to once come back to online
     - group id (when we have same listen with multiple replica)
     - Zookeeper(will be removed from 4+ version)


Process
   1. Start the zookeeper
   2. start the kafka
   3. create a topic (having offset and partisicion)

To start Zoo keeper server locally
  - bin zookeeper-server-start.sh config/zookeeper.properties

To start kafka server locally

 - bin/kafka-server-start.sh config/server.properties

 To increase number of particion for handling better load
  - ./bin/kafka-topics.sh --bootstrap-server localhost:9092 --alter --topic Payments --partitions 3

 -
   Zoo keeper default port : 2181
   Kafka default port : 9092



Producer
   - should have topic so that the consumers can connect the respective topic
   - need a configuration about where our kafka server is running
Consumer
   - should have kafka listener with topic name and group id
   - need a configuration about where our kafka server is running


   CQRS - Command and query resposibility and segrigation
     Read operation will be segrigated using query
     write update delete operation will be segrigated using command
     commad will communicate query microservice using kafka (producer and consumer







