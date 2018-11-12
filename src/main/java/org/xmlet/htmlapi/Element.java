package org.xmlet.htmlapi;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Element<T extends Element, Z extends Element> {
   <R extends Element> R addChild(R var1);

   T addAttr(Attribute var1);

   T self();

   void accept(ElementVisitor var1);

   String getName();

   List<Element> getChildren();

   List<Attribute> getAttributes();

   <R extends Element> Stream<R> find(Predicate<Element> var1);

   Z __();

   <M> T binder(BiConsumer<T, M> var1);

   boolean isBound();

   Element<T, Z> cloneElem();

   Element<T, Z> bindTo(java.lang.Object var1);
}
