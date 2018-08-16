$(document).ready(function () {
    $("#flex1").flexigrid({
        url: "http://localhost:8080/tutorial/getCustomers",
        dataType: 'json',
        colModel: [
            { display: 'ID', name: 'id', width: '*', sortable: true, align: 'center' },
            { display: 'Company', name: 'company', width: '*', sortable: true, align: 'left' },
            { display: 'Last Name', name: 'lastName', width: '*', sortable: true, align: 'left' },
            { display: 'First Name', name: 'firstName', width: '*', sortable: true, align: 'left' },
            { display: 'Email Address', name: 'emailAddress', width: '*', sortable: true, align: 'left' },
            { display: 'Job Title', name: 'jobTitle', width: '*', sortable: true, align: 'left' },
            { display: 'Business Phone', name: 'businessPhone', width: '*', sortable: true, align: 'left' },
            { display: 'Home Phone', name: 'homePhone', width: '*', sortable: true, align: 'left' },
            { display: 'Mobile Phone', name: 'mobilePhone', width: '*', sortable: true, align: 'left' },
            { display: 'Fax Number', name: 'faxNumber', width: '*', sortable: true, align: 'left' },
            { display: 'Address', name: 'address', width: '*', sortable: true, align: 'left' },
            { display: 'City', name: 'city', width: '*', sortable: true, align: 'left' },
            { display: 'State Province', name: 'stateProvince', width: '*', sortable: true, align: 'left' },
            { display: 'Zip Portal Code', name: 'zipPortalCode', width: '*', sortable: true, align: 'left' },
            { display: 'Country Region', name: 'countryRegion', width: '*', sortable: true, align: 'left' },
            { display: 'Web Page', name: 'webPage', width: '*', sortable: true, align: 'left' },
            { display: 'Notes', name: 'notes', width: '*', sortable: true, align: 'left' },
            { display: 'Attachments', name: 'attachments', width: '*', sortable: true, align: 'left' }
        ],
        searchitems: [
            { display: 'ISO', name: 'iso' },
            { display: 'Name', name: 'name', isdefault: true }
        ],
        sortname: "iso",
        sortorder: "asc",
        usepager: true,
        title: 'Customers',
        useRp: true,
        rp: 15,
        showTableToggleBtn: true,
        width: 2085,
        onSubmit: onSubmit,
        onSuccess: onSuccess,
        onRender: onRender,
        height: 200
    });

    //This function adds paramaters to the post of flexigrid. You can add a verification as well by return to false if you don't want flexigrid to submit			
    function onSubmit() {
        //passing a form object to serializeArray will get the valid data from all the objects, but, if the you pass a non-form object, you have to specify the input elements that the data will come from
        var dt = $('form').serializeArray();
        $("#flex1").flexOptions({ params: dt });
        return true;
    }

    function onSuccess() {
        return true;
    }

    function onRender() {
        return true;
    }

    $('form').submit(function () {
        $('#flex1').flexOptions({ newp: 1 }).flexReload();
        return false;
    });
});