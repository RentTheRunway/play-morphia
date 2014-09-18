package play.modules.morphia;

import com.mongodb.MongoClientOptions;

public interface MongoConfigurator {
    void configureOptions(MongoClientOptions.Builder options);
}
