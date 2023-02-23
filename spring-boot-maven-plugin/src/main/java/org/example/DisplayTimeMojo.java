package org.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 显示时间 Mojo
 *
 * @author zhouhuajian
 */
@Mojo(name="displayTime")
public class DisplayTimeMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        getLog().info(simpleDateFormat.format(new Date()));
        System.out.println("print something else.");
    }
}
