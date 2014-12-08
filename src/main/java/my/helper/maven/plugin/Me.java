package my.helper.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * @goal me
 * @author olivier
 *
 */
public class Me extends AbstractMojo {
	/**
	 * @parameter property="project.artifactId"
	 * @required
	 */
	private String artifactId;
	/**
	 * @parameter property="project.groupId"
	 * @required
	 * 
	 */
	private String groupId;
	/**
	 * @parameter property="project.version"
	 * @required
	 */
	private String version;

	public void execute() throws MojoExecutionException {
		System.out.println(String.format("my.help.me=%s:%s:%s", groupId, artifactId, version));
	}
}
