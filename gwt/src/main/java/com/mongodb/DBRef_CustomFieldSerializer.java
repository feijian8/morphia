package com.mongodb;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

/**
 *
 */
public class DBRef_CustomFieldSerializer {
    public static void deserialize(SerializationStreamReader streamReader,
                                   DBRef instance)
            throws SerializationException {
        // already handled in instantiate
    }

    /**
     *
     * @param streamReader
     * @return
     * @throws SerializationException
     */
    public static DBRef instantiate(SerializationStreamReader streamReader)
            throws SerializationException {
        return new DBRef((DB) streamReader.readObject(),
                streamReader.readString(),
                streamReader.readObject());
    }

    /**
     *
     * @param streamWriter
     * @param instance
     * @throws SerializationException
     */
    public static void serialize(SerializationStreamWriter streamWriter,
                                 DBRef instance)
            throws SerializationException {
        streamWriter.writeObject(instance.getDB());
        streamWriter.writeString(instance.getRef());
        streamWriter.writeObject(instance.getId());
    }
}
