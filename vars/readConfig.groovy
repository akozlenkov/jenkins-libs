@Grab('org.codehaus.groovy:groovy-all:3.0.9')
@Grab('org.codehaus.groovy:groovy-yaml:3.0.9')
import groovy.yaml.YamlSlurper
import groovy.text.GStringTemplateEngine

def createConfig = { file ->
    def config = new File(file).getText()
    return new YamlSlurper().parseText(engine.createTemplate(config).make(new YamlSlurper().parseText(config)).toString()) as Map
}

def call(String path) {
    return createConfig(path)
}
