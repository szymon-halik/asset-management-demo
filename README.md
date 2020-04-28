# asset-management-demo

This is an simple RestAPI application that can be used to generate schema for connecting an Externla Service in Salesforce

## Traning materials on Trailhead
[External Services](https://trailhead.salesforce.com/content/learn/modules/external-services)

## Open API schema
I am using OpenAPI 3 to generate docs for API. The application is deployed to Heorku and can be accessed and used with the following [link](https://sh-asset-management-demo.herokuapp.com/api-docs)

## Validating schema
Open API schema is by default stored as .json file. If you want to convert it to .yaml please use [swagger editor](https://editor.swagger.io/). The same editor is a prefred way to validate the schema.

## Usage 
You can navigate through app with [HAL browser](https://sh-asset-management-demo.herokuapp.com/browser/index.html#/) or [swagger-ui](https://sh-asset-management-demo.herokuapp.com/swagger-ui/index.html?configUrl=/api-docs/swagger-config). Standard CRUD operations are avaliable to play with an app. 
