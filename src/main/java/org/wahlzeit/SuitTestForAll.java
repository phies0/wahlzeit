package org.wahlzeit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.wahlzeit.handlers.HandlersTestSuite;
import org.wahlzeit.model.ModelTestSuite;
import org.wahlzeit.model.persistence.PersistenceTestSuite;
import org.wahlzeit.services.ServicesTestSuite;
import org.wahlzeit.services.mailing.MailTestSuite;

@RunWith(Suite.class)
@SuiteClasses({
    MailTestSuite.class,
    ServicesTestSuite.class,
    PersistenceTestSuite.class,
    ModelTestSuite.class,
    HandlersTestSuite.class
})

public class SuitTestForAll {

}
