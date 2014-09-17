package play.modules.morphia;

import com.mongodb.MongoOptions;

public interface MongoConfigurator {
    void configureOptions(MongoOptions options);
}
