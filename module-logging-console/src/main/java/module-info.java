module com.autentia.logging.console {

    requires com.autentia.logging;

    provides com.autentia.logging.Logger with com.autentia.logging.console.ConsoleLogger;

}
