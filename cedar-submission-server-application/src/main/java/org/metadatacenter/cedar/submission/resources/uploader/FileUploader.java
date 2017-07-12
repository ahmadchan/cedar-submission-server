package org.metadatacenter.cedar.submission.resources.uploader;

import java.io.File;
import java.io.IOException;

public interface FileUploader {

  void store(File file) throws IOException;

  void store(String directory, File file) throws IOException;

  void disconnect() throws IOException;
}
