import groovy.json.JsonSlurper

def call(String path) {
    def inputFile = new File(path)
    return new JsonSlurper().parseText(inputFile.text);
}

