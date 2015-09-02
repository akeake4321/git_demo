package aliTest;

import java.io.File;
import java.util.Date;
import java.util.List;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.Bucket;
import com.aliyun.oss.model.GetObjectRequest;
import com.aliyun.oss.model.ListObjectsRequest;
import com.aliyun.oss.model.OSSObjectSummary;
import com.aliyun.oss.model.ObjectListing;
import com.aliyun.oss.model.ObjectMetadata;

public class GetObjectTest {

	public static void main(String[] args) {
		
		String accessKeyId = "ZJPFSYPtd6EryCZ6";
		String secretAccessKey = "kcNwbGrmUUYH3ugcCAEEmiPmY82nBT";
		String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
		String bucketName = "cis-bucket";
		String key = "";
		String filename = "d:/alitest/"+key;
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, secretAccessKey);
		List<Bucket> buckets = ossClient.listBuckets();
		for(Bucket bucket : buckets){
			System.out.println(bucket.getName());
		}
		
//		ObjectMetadata objectMetadata = ossClient.getObject(new GetObjectRequest(bucketName, key),new File(filename));
//		long contentLength = objectMetadata.getContentLength();
//		String contentType = objectMetadata.getContentType();
//		Date lastModified = objectMetadata.getLastModified();
//		String etag = objectMetadata.getETag();
//		
//		System.out.println("contentLength="+contentLength);
//		System.out.println("contentType="+contentType);
//		System.out.println("lastModified="+lastModified);
//		System.out.println("etag="+etag);
//		
//		ListObjectsRequest listObjectsRequest = new ListObjectsRequest();
//		listObjectsRequest.setPrefix("/");
//		ObjectListing objectListing = ossClient.listObjects(listObjectsRequest);
//		while(!objectListing.isTruncated()){
//			String marker = objectListing.getNextMarker();
//			listObjectsRequest.setMarker(marker);
//			objectListing = ossClient.listObjects(listObjectsRequest);
//			for(OSSObjectSummary objectSummary : objectListing.getObjectSummaries()){
//				System.out.println(objectSummary.getKey());
//			}
//		}
	}
}
