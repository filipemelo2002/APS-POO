package com.unifg.aps.poo.history;

import com.unifg.aps.poo.editor.Editor;

public class Memento {
  private String backup;
  private Editor editor;

  public Memento(Editor editor) {
    this.editor = editor;
    this.backup = editor.backup();
  }

  public void restore() {
    editor.restore(backup);
  }
}
