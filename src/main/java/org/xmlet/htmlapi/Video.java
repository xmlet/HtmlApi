package org.xmlet.htmlapi;

public class Video<Z extends Element> extends AbstractElement<Video<Z>, Z> implements CommonAttributeGroup<Video<Z>, Z>, VideoChoice0<Video<Z>, Z> {
   public Video() {
      super("video");
   }

   public Video(String name) {
      super(name);
   }

   public Video(Z parent) {
      super(parent, "video");
   }

   public Video(Z parent, String name) {
      super(parent, name);
   }

   public Video<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Video<Z> cloneElem() {
      return (Video)this.clone(new Video());
   }

   public Video<Z> attrSrc(String attrSrc) {
      return (Video)this.addAttr(new AttrSrcString(attrSrc));
   }

   public Video<Z> attrAutobuffer(EnumAutobufferVideo attrAutobuffer) {
      return (Video)this.addAttr(new AttrAutobufferEnumAutobufferVideo(attrAutobuffer));
   }

   public Video<Z> attrAutoplay(EnumAutoplayVideo attrAutoplay) {
      return (Video)this.addAttr(new AttrAutoplayEnumAutoplayVideo(attrAutoplay));
   }

   public Video<Z> attrLoop(EnumLoopVideo attrLoop) {
      return (Video)this.addAttr(new AttrLoopEnumLoopVideo(attrLoop));
   }

   public Video<Z> attrControls(EnumControlsVideo attrControls) {
      return (Video)this.addAttr(new AttrControlsEnumControlsVideo(attrControls));
   }

   public Video<Z> attrWidth(java.lang.Object attrWidth) {
      return (Video)this.addAttr(new AttrWidthObject(attrWidth));
   }

   public Video<Z> attrHeight(java.lang.Object attrHeight) {
      return (Video)this.addAttr(new AttrHeightObject(attrHeight));
   }

   public Video<Z> attrPoster(java.lang.Object attrPoster) {
      return (Video)this.addAttr(new AttrPosterObject(attrPoster));
   }
}
