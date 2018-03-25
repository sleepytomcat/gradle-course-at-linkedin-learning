# 'java' plugin adds a number of tasks, i.e. 'clean' task to cleanup intermediate and output files
gradle clean

# also 'compileJava' to compile Java code
# (note that by default source code is expected to be structured in particular way,
# and there're pre-defined folder structure for intermediate and output files)
gradle compileJava

# also 'assemble' to compose jar file
gradle assemble

# also 'test' to run unit tests
gradle test

# but most importantly, 'build' task
gradle build

# list all tasks:
gradle tasks --all

# build.gradle file configures Project object instance, which, 
# when executed, actually runs the tasks and builds project;
# there's a way to see all the Porject object properties:
gradle properties
