import com.home.chapter04.GroovyConfiguration.Singer
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader
import org.springframework.context.support.GenericApplicationContext

def context = new GenericApplicationContext();
def reader = new GroovyBeanDefinitionReader(context);

reader.beans {
    singer(Singer, name: 'John Mayer', age: '39')
}

context.refresh()

println context.getBean("singer");