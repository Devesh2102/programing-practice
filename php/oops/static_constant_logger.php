<?php
class Logger {
    const INFO = 'INFO';
    const WARNING = 'WARNING';
    const ERROR = 'ERROR';

    public static function log($message, $level = self::INFO) {
        // Use self:: to access class constants
        echo "[" . self::getTimestamp() . "] " . $level . ": " . $message . "\n";
    }

    protected static function getTimestamp() {
        return date("Y-m-d H:i:s");
    }
}

class FileLogger extends Logger {
    const LOG_FILE = 'file.txt';

    public static function log($message, $level = self::INFO) {
        // Use parent:: to reuse timestamp logic
        $timestamp = parent::getTimestamp();

        // Use static:: for late static binding (class context)
        $context = static::class;

        echo "[" . $timestamp . "] [$context] $level: $message\n";
        // Example of writing to file. Not writing to file for now
        //file_put_contents(self::LOG_FILE, "[$timestamp] [$context] $level: $message\n", FILE_APPEND);
    }
}

// Call Logger directly
Logger::log("System booting...", Logger::INFO);
Logger::log("Memory usage high!", Logger::WARNING);

// Call FileLogger, which overrides and uses parent + self + static
FileLogger::log("File system error!", Logger::ERROR);
?>
