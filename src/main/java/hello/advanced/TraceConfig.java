package hello.advanced;

import hello.advanced.trace.callback.TraceTemplate;
import hello.advanced.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TraceConfig {

    @Bean
    public TraceTemplate traceTemplate(LogTrace logTrace){
        return new TraceTemplate(logTrace);
    }

}
