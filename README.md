# jsonschema2pojo-ignoreunknown-annotator

Custom annotator to be used with jsonschema2pojo (https://github.com/joelittlejohn/jsonschema2pojo) to set the class level annotation @JsonIgnoreProperties(ignoreUnknown = true). It can be used to either suppress serialization of unknown properties, or ignore processing of JSON properties during deserialization.
