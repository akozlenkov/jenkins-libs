import groovy.json.JsonSlurper

def call(String path) {
    //def inputFile = new File(path);
    //return inputFile.text;
    //return new JsonSlurper().parseText(inputFile.text);
    return new ConfigSlurper().parse(new URL("file:$path"));
}

