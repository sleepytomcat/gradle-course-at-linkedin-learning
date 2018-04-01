# build our custom gradle plugin first
# (also note /showdate-gradle-plugin/settings.gradle which allows to build sub-project independently
cd showdate-gradle-plugin
gradle build
cd ..
# let's run the customized task - using the 'showdate-gradle-plugin' plugin
gradle showDate
