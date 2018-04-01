import org.gradle.api.tasks.TaskAction
import org.gradle.api.DefaultTask

class ShowDate extends DefaultTask {
    String message = 'Date is: '
    @TaskAction
    def showDate() {
	println message + new Date()
    }
}
