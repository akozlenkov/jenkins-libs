@Grab('com.typesafe:config:1.4.1')
import com.typesafe.config.ConfigFactory

def call(String path) {
    return ConfigFactory.parseFile(new File(path)).resolve()
}
