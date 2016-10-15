package scijoker.npsdk.api;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;
import scijoker.npsdk.request.TrackingDocumentRequestObj;
import scijoker.npsdk.response.TrackingDocumentResponseObj;

/**
 * Created by scijoker on 15.10.16.
 */

public interface DictionariesApi {
    @POST("/v2.0/json/")
    Observable<TrackingDocumentResponseObj> getDocumentStatuses(@Body TrackingDocumentRequestObj obj);
}
