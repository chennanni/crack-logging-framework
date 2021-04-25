# LogTestSystem

1. Enable each individual logging framework with minimum code/config/dependency.

- jcl-logging
- jdk-logging
- log4j1
- log4j2
- slf4j2log4j1
- slf4j2log4j2
- slf4j2logback

2. Try to make multiple logging framework work together without issues.

- multi-loggers
  - log4j1
  - log4j2
  - slf4j + log4j2
- multi-loggers2
  - log4j1
  - log4j2 -> wire to log4j1
  - slf4j + log4j1
