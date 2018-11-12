package org.xmlet.htmlapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public abstract class AbstractElement<T extends Element, Z extends Element> implements Element<T, Z> {
   protected List<Element> children = new ArrayList();
   protected List<Attribute> attrs = new ArrayList();
   protected String name;
   protected Z parent;
   protected BiConsumer binderMethod;

   protected AbstractElement(String name) {
      this.name = name;
   }

   protected AbstractElement(Z parent, String name) {
      this.parent = parent;
      this.name = name;
   }

   public <R extends Element> R addChild(R child) {
      this.children.add(child);
      return child;
   }

   public T addAttr(Attribute attribute) {
      this.attrs.add(attribute);
      return this.self();
   }

   public final String getName() {
      return this.name;
   }

   public final Z __() {
      return this.parent;
   }

   public final <R extends Element> Stream<R> find(Predicate<Element> predicate) {
      Supplier streamSupplier = () -> {
         return this.children.stream().filter(predicate).map((var0) -> {
            return var0;
         });
      };
      if (((Stream)streamSupplier.get()).count() != 0L) {
         return (Stream)streamSupplier.get();
      } else {
         Stream[] var3 = new Stream[]{Stream.empty()};
         this.children.forEach((var2) -> {
            var3[0] = Stream.concat(var3[0], ((Element)var2).find(predicate));
         });
         return var3[0];
      }
   }

   public final List<Element> getChildren() {
      return this.children;
   }

   public final List<Attribute> getAttributes() {
      return this.attrs;
   }

   public final <M> T binder(BiConsumer<T, M> var1) {
      this.binderMethod = var1;
      return this.self();
   }

   public final boolean isBound() {
      return this.binderMethod != null;
   }

   public final Element<T, Z> bindTo(java.lang.Object model) {
      if (this.isBound()) {
         this.binderMethod.accept(this.self(), model);
      }

      return this.self();
   }

   public final T of(Consumer<T> consumer) {
      consumer.accept(this.self());
      return this.self();
   }

   protected final <X extends AbstractElement<T, Z>> X clone(X clone) {
      clone.children = new ArrayList(this.children);
      clone.attrs = new ArrayList(this.attrs);
      clone.name = this.name;
      clone.parent = this.parent;
      clone.binderMethod = this.binderMethod;
      return clone;
   }
}
