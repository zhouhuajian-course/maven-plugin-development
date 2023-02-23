package org.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Mojo对应插件的Goal
 * Says "Hi" to the user.
 */
@Mojo(name="sayhi")
public class SayHiMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException {
        getLog().info("Hello, world.");
    }
}
