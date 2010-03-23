/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.s3.Headers;

/**
 * Represents the metadata that Amazon S3 stores for an object, including custom
 * user supplied metadata, as well as the standard HTTP headers that Amazon S3
 * sends and receives (Content-Length, ETag, Content-MD5, etc.).
 */
public class ObjectMetadata {

    /*
     * TODO: Might be nice to get as many of the internal use only methods out
     *       of here so users never even see them. 
     *       Example: we could set the ETag header directly through the raw 
     *                metadata map instead of having a setter for it.
     */

    /**
     * Custom user metadata, represented in responses with the x-amz-meta-
     * header prefix
     */
    private Map<String, String> userMetadata = new HashMap<String, String>();

    /**
     * All other (non user custom) headers such as Content-Length, Content-Type,
     * etc.
     */
    private Map<String, Object> metadata = new HashMap<String, Object>();

    /**
     * Returns all the custom user metadata for the associated object.
     * <p>
     * Amazon S3 can store additional metadata on objects by internally
     * representing it as HTTP headers prefixed with "x-amz-meta-". Callers can
     * use user metadata to store arbitrary metadata alongside their data in
     * Amazon S3. When setting user metadata, callers <b>should not</b> include
     * the internal "x-amz-meta-" prefix, as this library will handle that for
     * them. Likewise, when callers retrieve custom user metadata, they will not
     * see the "x-amz-meta-" header prefix.
     * <p>
     * Note that user metadata for an object is limited by the HTTP request
     * header limit. All HTTP headers included in a request (including user
     * metadata headers and other standard HTTP headers) must be less than 8KB.
     * 
     * @return All the custom user metadata for the associated object.
     */
    public Map<String, String> getUserMetadata() {
        return userMetadata;
    }

    /**
     * Sets the custom user metadata for the associated object.
     * <p>
     * Amazon S3 can store additional metadata on objects by internally
     * representing it as HTTP headers prefixed with "x-amz-meta-". Callers can
     * use user metadata to store arbitrary metadata alongside their data in
     * Amazon S3. When setting user metadata, callers <b>should not</b> include
     * the internal "x-amz-meta-" prefix, as this library will handle that for
     * them. Likewise, when callers retrieve custom user metadata, they will not
     * see the "x-amz-meta-" header prefix.
     * <p>
     * Note that user metadata for an object is limited by the HTTP request
     * header limit. All HTTP headers included in a request (including user
     * metadata headers and other standard HTTP headers) must be less than 8KB.
     * 
     * @param userMetadata
     *            The custom user metadata for the associated object.
     */
    public void setUserMetadata(Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
    }

    /**
     * <b>For internal use only</b>. Sets a specific metadata header value. Not
     * intended to be called by external code.
     * 
     * @param key
     *            The name of the header being set.
     * @param value
     *            The value for the header.
     */
    public void setHeader(String key, Object value) {
        metadata.put(key, value);
    }

    /**
     * Adds the key value pair of custom user metadata for the associated
     * object. If the entry in the custom user metadata map already contains the
     * specified key, it will be replaced with these new contents.
     * <p>
     * Amazon S3 can store additional metadata on objects by internally
     * representing it as HTTP headers prefixed with "x-amz-meta-". Callers can
     * use user metadata to store arbitrary metadata alongside their data in
     * Amazon S3. When setting user metadata, callers <b>should not</b> include
     * the internal "x-amz-meta-" prefix, as this library will handle that for
     * them. Likewise, when callers retrieve custom user metadata, they will not
     * see the "x-amz-meta-" header prefix.
     * <p>
     * Note that user metadata for an object is limited by the HTTP request
     * header limit. All HTTP headers included in a request (including user
     * metadata headers and other standard HTTP headers) must be less than 8KB.
     * 
     * @param key
     *            The key for the custom user metadata entry (should not include
     *            the internal S3 HTTP header prefix).
     * @param value
     *            The value for the custom user metadata entry.
     */
    public void addUserMetadata(String key, String value) {
        this.userMetadata.put(key, value);
    }

    /**
     * For <b>internal use only</b>. Returns a map of the raw metadata/headers
     * for the associated object.
     * 
     * @return A map of the raw metadata/headers for the associated object.
     */
    public Map<String, Object> getRawMetadata() {
        return Collections.unmodifiableMap(metadata);
    }

    /**
     * Returns the value of the Last-Modified header, which indicates the date
     * and time at which Amazon S3 last recorded a modification to the
     * associated object.
     * 
     * @return The date and time at which Amazon S3 last recorded a modification
     *         to the associated object, or null if it hasn't been set yet.
     */
    public Date getLastModified() {
        return (Date)metadata.get(Headers.LAST_MODIFIED);
    }

    /**
     * For <b>internal use only</b>. Sets the Last-Modified header value
     * indicating the date and time at which Amazon S3 last recorded a
     * modification to the associated object.
     * 
     * @param lastModified
     *            The date and time at which Amazon S3 last recorded a
     *            modification to the associated object.
     */
    public void setLastModified(Date lastModified) {
        metadata.put(Headers.LAST_MODIFIED, lastModified);
    }

    /**
     * Returns the Content-Length HTTP header which indicates the size of the
     * associated object in bytes.
     * <p>
     * This field is required when uploading objects to S3, but the AWS S3 Java
     * client will automatically set it when working directly with files. When
     * uploading directly from a stream the caller should set this field if
     * possible, otherwise the client will have to buffer the entire stream in
     * order to calculate the content length before it can send the data to
     * Amazon S3.
     * <p>
     * For more information on the Content-Length HTTP header, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13</a>
     * 
     * @return The Content-Length HTTP header, indicating the size of the
     *         associated object in bytes, or null if it hasn't been set yet.
     * 
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13</a>
     */
    public long getContentLength() {
        Long contentLength = (Long)metadata.get(Headers.CONTENT_LENGTH);
        
        if (contentLength == null) return 0;
        return contentLength.longValue();
    }

    /**
     * Sets the Content-Length HTTP header which indicates the size of the
     * associated object in bytes.
     * <p>
     * This field is required when uploading objects to S3, but the AWS S3 Java
     * client will automatically set it when working directly with files. When
     * uploading directly from a stream the caller should set this field if
     * possible, otherwise the client will have to buffer the entire stream in
     * order to calculate the content length before it can send the data to
     * Amazon S3.
     * <p>
     * For more information on the Content-Length HTTP header, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13</a>
     * 
     * @param contentLength
     *            The Content-Length HTTP header, indicating the size of the
     *            associated object in bytes.
     * 
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13</a>
     */
    public void setContentLength(long contentLength) {
        metadata.put(Headers.CONTENT_LENGTH, contentLength);
    }

    /**
     * Returns the Content-Type HTTP header, which indicates the type of content
     * stored in the associated object. The value of this header is a standard
     * MIME type.
     * <p>
     * When uploading files, the AWS S3 Java client will attempt to determine
     * the correct content type if one hasn't been set yet. Users are
     * responsible for ensuring a suitable content type is set when uploading
     * streams. If no content type is provided, and cannot be determined by
     * filename, then the default content type, "application/octet-stream", will
     * be used.
     * <p>
     * For more information on the Content-Type header, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>
     * 
     * @return The HTTP Content-Type header, indicating the type of content
     *         stored in the associated S3 object, or null if it hasn't been
     *         set.
     * 
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>
     */
    public String getContentType() {
        return (String)metadata.get(Headers.CONTENT_TYPE);
    }

    /**
     * Sets the Content-Type HTTP header, which indicates the type of content
     * stored in the associated object. The value of this header is a standard
     * MIME type.
     * <p>
     * When uploading files, the AWS S3 Java client will attempt to determine
     * the correct content type if one hasn't been set yet. Users are
     * responsible for ensuring a suitable content type is set when uploading
     * streams. If no content type is provided, and cannot be determined by
     * filename, then the default content type, "application/octet-stream", will
     * be used.
     * <p>
     * For more information on the Content-Type header, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>
     * 
     * @param contentType
     *            The HTTP Content-Type header, indicating the type of content
     *            stored in the associated S3 object.
     * 
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>
     */
    public void setContentType(String contentType) {
        metadata.put(Headers.CONTENT_TYPE, contentType);
    }

    /**
     * Returns the optional Content-Encoding HTTP header, which specifies what
     * content encodings have been applied to the object, and thus what decoding
     * mechanisms must be applied in order to obtain the media-type referenced
     * by the Content-Type field.
     * <p>
     * For more information on how the Content-Encoding HTTP header works, see
     * <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11</a>
     * 
     * @return The HTTP Content-Encoding header, or null if it hasn't been set.
     * 
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11</a>
     */
    public String getContentEncoding() {
        return (String)metadata.get(Headers.CONTENT_ENCODING);
    }

    /**
     * Sets the optional Content-Encoding HTTP header, which specifies what
     * content encodings have been applied to the object, and thus what decoding
     * mechanisms must be applied in order to obtain the media-type referenced
     * by the Content-Type field.
     * <p>
     * For more information on how the Content-Encoding HTTP header works, see
     * <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11</a>
     * 
     * @param encoding
     *            The HTTP Content-Encoding header, as defined in RFC 2616.
     * 
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11</a>
     */
    public void setContentEncoding(String encoding) {
        metadata.put(Headers.CONTENT_ENCODING, encoding);
    }

    /**
     * Returns the optional Cache-Control HTTP header which allows the user to
     * specify caching behavior along the HTTP request/reply chain.
     * <p>
     * For more information on how the Cache-Control HTTP header affects HTTP
     * requests and responses see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>
     * 
     * @return The HTTP Cache-Control header, as defined in RFC 2616, or null if
     *         it hasn't been set.
     * 
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>
     */
    public String getCacheControl() {
        return (String)metadata.get(Headers.CACHE_CONTROL);
    }

    /**
     * Sets the optional Cache-Control HTTP header which allows the user to
     * specify caching behavior along the HTTP request/reply chain.
     * <p>
     * For more information on how the Cache-Control HTTP header affects HTTP
     * requests and responses see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>
     * 
     * @param cacheControl
     *            The HTTP Cache-Control header, as defined in RFC 2616.
     * 
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>
     */
    public void setCacheControl(String cacheControl) {
        metadata.put(Headers.CACHE_CONTROL, cacheControl);
    }

    /**
     * Sets the base64 encoded 128-bit MD5 digest of the associated object
     * (content - not including headers) according to RFC 1864. This data is
     * used as a message integrity check to verify that the data received by
     * Amazon S3 is the same data that the caller sent.
     * <p>
     * This field represents the base64 encoded 128-bit MD5 digest digest of an
     * object's content as calculated on the caller's side. The ETag metadata
     * field represents the hex encoded 128-bit MD5 digest as computed by Amazon
     * S3.
     * <p>
     * The AWS S3 Java client will attempt to calculate this field automatically
     * when uploading files to Amazon S3.
     * 
     * @param md5Base64
     *            The base64 encoded MD5 hash of the content for the object
     *            associated with this metadata.
     */
    public void setContentMD5(String md5Base64) {
        metadata.put(Headers.CONTENT_MD5, md5Base64);
    }

    /**
     * Returns the base64 encoded 128-bit MD5 digest of the associated object
     * (content - not including headers) according to RFC 1864. This data is
     * used as a message integrity check to verify that the data received by
     * Amazon S3 is the same data that the caller sent.
     * <p>
     * This field represents the base64 encoded 128-bit MD5 digest digest of an
     * object's content as calculated on the caller's side. The ETag metadata
     * field represents the hex encoded 128-bit MD5 digest as computed by Amazon
     * S3.
     * <p>
     * The AWS S3 Java client will attempt to calculate this field automatically
     * when uploading files to Amazon S3.
     * 
     * @return The base64 encoded MD5 hash of the content for the associated
     *         object, or null if it hasn't been set.
     */
    public String getContentMD5() {
        return (String)metadata.get(Headers.CONTENT_MD5);
    }

    /**
     * Sets the optional Content-Disposition HTTP header, which specifies
     * presentational information such as the recommended filename for the
     * object to be saved as.
     * <p>
     * For more information on how the Content-Disposition header affects HTTP
     * client behavior, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1</a>
     * 
     * @param disposition
     *            The value for the Content-Disposition header.
     * 
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1</a>
     */
    public void setContentDisposition(String disposition) {
        metadata.put(Headers.CONTENT_DISPOSITION, disposition);
    }

    /**
     * Returns the optional Content-Disposition HTTP header, which specifies
     * presentation information for the object such as the recommended filename
     * for the object to be saved as.
     * <p>
     * For more information on how the Content-Disposition header affects HTTP
     * client behavior, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1</a>
     * 
     * @return The value of the Content-Disposition header, or null if it hasn't
     *         been set.
     * 
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1</a>
     */
    public String getContentDisposition() {
        return (String)metadata.get(Headers.CONTENT_DISPOSITION);
    }

    /**
     * Returns the hex encoded 128-bit MD5 digest of the associated object
     * according to RFC 1864. This data is used as an integrity check to verify
     * that the data received by the caller is the same data that was sent by
     * Amazon S3.
     * <p>
     * This field represents the hex encoded 128-bit MD5 digest of an object's
     * content as calculated by Amazon S3. The ContentMD5 field represents the
     * base64 encoded 128-bit MD5 digest as calculated on the caller's side.
     * 
     * @return The hex encoded MD5 hash of the content for the associated object
     *         as calculated by Amazon S3, or null if it hasn't been set yet.
     */
    public String getETag() {
        return (String)metadata.get(Headers.ETAG);
    }

    /**
     * Returns the version ID of the associated Amazon S3 object, if available.
     * Version IDs are only assigned to objects when an object is uploaded to an
     * Amazon S3 bucket that has object versioning enabled.
     * 
     * @return The version ID of the associated Amazon S3 object, if available.
     */
    public String getVersionId() {
        return (String)metadata.get(Headers.S3_VERSION_ID);
    }

}
