// Autogenerated from Pigeon (v3.2.3), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.mapbox.maps.pigeons;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class FLTGestureListeners {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class ScreenCoordinate {
    private @NonNull Double x;
    public @NonNull Double getX() { return x; }
    public void setX(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"x\" is null.");
      }
      this.x = setterArg;
    }

    private @NonNull Double y;
    public @NonNull Double getY() { return y; }
    public void setY(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"y\" is null.");
      }
      this.y = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private ScreenCoordinate() {}
    public static final class Builder {
      private @Nullable Double x;
      public @NonNull Builder setX(@NonNull Double setterArg) {
        this.x = setterArg;
        return this;
      }
      private @Nullable Double y;
      public @NonNull Builder setY(@NonNull Double setterArg) {
        this.y = setterArg;
        return this;
      }
      public @NonNull ScreenCoordinate build() {
        ScreenCoordinate pigeonReturn = new ScreenCoordinate();
        pigeonReturn.setX(x);
        pigeonReturn.setY(y);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("x", x);
      toMapResult.put("y", y);
      return toMapResult;
    }
    static @NonNull ScreenCoordinate fromMap(@NonNull Map<String, Object> map) {
      ScreenCoordinate pigeonResult = new ScreenCoordinate();
      Object x = map.get("x");
      pigeonResult.setX((Double)x);
      Object y = map.get("y");
      pigeonResult.setY((Double)y);
      return pigeonResult;
    }
  }
  private static class GestureListenerCodec extends StandardMessageCodec {
    public static final GestureListenerCodec INSTANCE = new GestureListenerCodec();
    private GestureListenerCodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return ScreenCoordinate.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof ScreenCoordinate) {
        stream.write(128);
        writeValue(stream, ((ScreenCoordinate) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java.*/
  public static class GestureListener {
    private final BinaryMessenger binaryMessenger;
    public GestureListener(BinaryMessenger argBinaryMessenger){
      this.binaryMessenger = argBinaryMessenger;
    }
    public interface Reply<T> {
      void reply(T reply);
    }
    static MessageCodec<Object> getCodec() {
      return GestureListenerCodec.INSTANCE;
    }

    public void onTap(@NonNull ScreenCoordinate coordinateArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GestureListener.onTap", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(coordinateArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void onLongTap(@NonNull ScreenCoordinate coordinateArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GestureListener.onLongTap", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(coordinateArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void onScroll(@NonNull ScreenCoordinate coordinateArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GestureListener.onScroll", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(coordinateArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void onScrollStart(@NonNull ScreenCoordinate coordinateArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GestureListener.onScrollStart", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(coordinateArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void onScrollEnd(@NonNull ScreenCoordinate coordinateArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GestureListener.onScrollEnd", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(coordinateArg)), channelReply -> {
        callback.reply(null);
      });
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
