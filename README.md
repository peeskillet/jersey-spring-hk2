Jersey Spring HK2 Integration example
====

Based on Stackoverflow question [Is it possible to construct an object partially with Spring DI and partially with Jersey CDI?][1]

[1]: http://stackoverflow.com/q/30987153/2587435

###To run

(Maven required for these steps. If you don't have Maven, you can just deploy to any Servlet container)

1. `cd` to `jersey-spring-hk2`.
2.  Run `mvn clean package`
3.  Run `mvn jetty:run`. Wait til you see "Started Jetty Server"
4.  If you have cURL, from another command line, run `curl http://localhost:8080/api/simple`. 
Without cURL, you can pur the URL in a browser.

Anyway you decide to run it, the output should be "HK2 Message and also Spring Message".
