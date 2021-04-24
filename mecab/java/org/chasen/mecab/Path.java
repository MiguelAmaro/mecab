/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.chasen.mecab;

public class Path {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Path(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Path obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MeCabJNI.delete_Path(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Node getRnode() {
    long cPtr = MeCabJNI.Path_rnode_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Path getRnext() {
    long cPtr = MeCabJNI.Path_rnext_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Path(cPtr, false);
  }

  public Node getLnode() {
    long cPtr = MeCabJNI.Path_lnode_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Path getLnext() {
    long cPtr = MeCabJNI.Path_lnext_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Path(cPtr, false);
  }

  public int getCost() {
    return MeCabJNI.Path_cost_get(swigCPtr, this);
  }

  public void setProb(float value) {
    MeCabJNI.Path_prob_set(swigCPtr, this, value);
  }

  public float getProb() {
    return MeCabJNI.Path_prob_get(swigCPtr, this);
  }

}
