# list all projects
gradle projects

# project(s) dependencies
gradle dependencies

# limit output to particular configuration
gradle dependencies --configuration compile

# 'project-report' plugin generates html dependencies report file
gradle htmlDependencyReport

# 'projectReport' task (added by 'project-report' plugin) generates several reports for the current project 
gradle projectReport
