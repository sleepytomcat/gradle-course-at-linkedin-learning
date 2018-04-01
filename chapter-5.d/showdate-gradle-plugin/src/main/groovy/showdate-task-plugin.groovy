import org.gradle.api.Project
import org.gradle.api.Plugin

class ShowDatePlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
	project.task('showDate', type: ShowDate)
    }
}
