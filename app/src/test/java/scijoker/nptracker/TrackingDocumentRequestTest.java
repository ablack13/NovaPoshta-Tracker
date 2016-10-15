package scijoker.nptracker;

import org.junit.Before;
import org.junit.Test;

import rx.functions.Action1;
import scijoker.npsdk.NovaPoshtaSDK;
import scijoker.npsdk.request.TrackingDocumentRequestObj;
import scijoker.npsdk.response.TrackingDocumentResponseObj;
import scijoker.nptracker.net.ApiConstants;

/**
 * Created by scijoker on 15.10.16.
 */

public class TrackingDocumentRequestTest {
    @Before
    public void setUp() throws Exception {
        NovaPoshtaSDK.setup(ApiConstants.API_KEY, true);
    }

    @Test
    public void testGetDocumentStatusesRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getDocumentStatuses(new TrackingDocumentRequestObj("20450017510673"))
                .subscribe(new Action1<TrackingDocumentResponseObj>() {
                    @Override
                    public void call(TrackingDocumentResponseObj response) {
                        for (TrackingDocumentResponseObj.Data data : response.data) {
                            System.out.println("TTN Number::" + data.Number);
                        }
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable e) {
                        e.printStackTrace();
                    }
                });
    }
}
