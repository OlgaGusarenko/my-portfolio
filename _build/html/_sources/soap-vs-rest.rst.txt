.. raw:: pdf

   PageBreak

.. _soap-vs-rest:

====================================================
Exercise #2 — REST vs SOAP: Choosing the web service
====================================================

This section provides a short overview that can help a web developer
choose when to use REST or SOAP web services.

SOAP and REST are two of the most common API paradigms to consider when
formulating the API delivery strategy.

SOAP is a protocol, and REST is an architectural style. Both technologies
have their advantages and disadvantages and can better fit different scenarios.
Deciding one over the other can be surprisingly difficult and depends on the
application requirements, environment, programming language, and other factors.

Web services overview
=====================

Before you do a deep dive into the key differences between REST and SOAP, we
suggest that you get acquanted with each of this technology.

What is SOAP?
+++++++++++++

SOAP (Simple Object Access Protocol) is a messaging protocol specification for
exchanging structured information in the implementation of web services in
computer networks. SOAP uses XML for exchanging information in its message
format. For message negotiation and transmission, SOAP relies on application
layer protocols, which is most often Hypertext Transfer Protocol (HTTP).

SOAP enables developers to invoke processes running on disparate operating
systems that include Windows, macOS, and Linux to authenticate, authorize, and
communicate. Since Web protocols like HTTP are installed and running on all
operating systems, SOAP enables clients to invoke web services and receive
responses regardless of language and platforms.

The key SOAP characteristics include:

* Extensibility
   Security and WS-addressing are among the extensions under development

* Neutrality
   Can operate over any protocol such as HTTP, SMTP, TCP, and UDP

* Independence
   Allows for any programming model

What is REST API?
+++++++++++++++++

REST (REpresentational State Transfer) is a software architectural style.
Web services that conform to the REST architectural style, are called RESTful
Web services. A RESTful Web service enables a requesting system to access
and manipulate textual representations of Web resources by using a uniform
and predefined set of stateless operations.

A RESTful system follows six constraints that restrict the ways that the
server can use to process and respond to client requests. If a system violates
any of these constraints, it cannot be considered RESTful. These constraints
include:

* Uniform interface
* Client-server architecture
* Statelessness
* Cacheability
* Layered system
* Code on demand (optional)

The constraints of the REST technology enables the following architetural
properties of a RESTful system:

* High performance in component interactions
* Scalability that allows for the support of large numbers of components and
  their interactions
* Simplicity of a unifrom interface
* Modifiability of components
* Visibility of communication between components by service agents
* Portability of components by moving program code with the data
* Reliability in the resistance to failure at the system level in the presence
  of failures within components, connectors, or data

Differences
===========

Although, SOAP and REST are inherently different technologies and cannot be
easily compared, there is a number of key differences that could make you want
to use one over the other for your application.

.. list-table:: SOAP vs REST: Comparison table
   :widths: 10 25 25
   :header-rows: 1

   * - Characteristic
     - SOAP
     - REST
   * - Design
     - Protocol
     - Architectural style
   * - Standardization
     - Follows a strict standard to enable communication between the client
       and the server
     - Follows key architectural constraints restricting the ways that the
       server can use to process and respond to client requests
   * - Function
     - Function-driven (transfers structured information)
     - Data-driven (accesses a reaource for data)
   * - Efficiency
     - Uses XML for exchanging information in its message format
     - Permits different data format, including XML and smaller message
       format such as JSON or plain text
   * - Bandwidth
     - Requires more bandwidth and resources
     - Requires less resources and is lightweight
   * - Data cache
     - Cannot be cached
     - Can be cached
   * - Implementation
     - Is difficult to implement
     - Is easier to implement
   * - Security
     - Supports SSL and WS-security
     - Supports SSL and HTTPS
   * - Payload handling
     - Has a strict comminucation contract and requires knowledge of everything
       before any interaction
     - Requires no knowledge of the API

Summing up, the RESTful architecture is a more popular choice among web
developers, as it requires less resources and is easier to implement. However,
for an enterprise application that requires strong security and has a longer
list of requirements, the SOAP protocol might be a better choice.
