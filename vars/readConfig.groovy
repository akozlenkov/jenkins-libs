// @GrabResolver(name='central', root='https://repo1.maven.org/maven2/')
@Grab('org.codehaus.groovy:groovy-yaml:3.0.9')
import groovy.yaml.YamlSlurper
import groovy.text.GStringTemplateEngine


def call(String path) {
    def config = new File(path).getText()
    return new YamlSlurper().parseText(new GStringTemplateEngine().createTemplate(config).make(new YamlSlurper().parseText(config)).toString()) as Map
}
