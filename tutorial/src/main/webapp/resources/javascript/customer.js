$(document).ready(function() {
    var ui = {
        grid: $("#flex1")
    };
    
    init();
    
    function init() {
        initGrid();
        search();
    }
    
    function initGrid() {
        ui.grid.flexigrid({
            dataType: 'json',
            colModel: [
                { display: 'ID', id: 'id', name: 'id', width: 30, sortable: true, align: 'center' },
                { display: 'Company', name: 'company', width: 100, sortable: true, align: 'left' },
                { display: 'Last Name', name: 'lastName', width: 100, sortable: true, align: 'left' },
                { display: 'First Name', name: 'firstName', width: 100, sortable: true, align: 'left' },
                { display: 'Email Address', name: 'emailAddress', width: 100, sortable: true, align: 'left' },
                { display: 'Job Title', name: 'jobTitle', width: 200, sortable: true, align: 'left' },
                { display: 'Business Phone', name: 'businessPhone', width: 100, sortable: true, align: 'left' },
                { display: 'Home Phone', name: 'homePhone', width: 100, sortable: true, align: 'left' },
                { display: 'Mobile Phone', name: 'mobilePhone', width: 100, sortable: true, align: 'left' },
                { display: 'Fax Number', name: 'faxNumber', width: 100, sortable: true, align: 'left' },
                { display: 'Address', name: 'address', width: 100, sortable: true, align: 'left' },
                { display: 'City', name: 'city', width:100, sortable: true, align: 'left' },
                { display: 'State Province', name: 'stateProvince', width: 100, sortable: true, align: 'left' },
                { display: 'Zip Portal Code', name: 'zipPortalCode', width: 100, sortable: true, align: 'left' },
                { display: 'Country Region', name: 'countryRegion', width: 100, sortable: true, align: 'left' },
                { display: 'Web Page', name: 'webPage', width: 100, sortable: true, align: 'left' },
                { display: 'Notes', name: 'notes', width: 100, sortable: true, align: 'left' },
                { display: 'Attachments', name: 'attachments', width: 100, sortable: true, align: 'left' }
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
            autoGenerateColumns: false,
            showTableToggleBtn: true,
            onSubmit: onSubmit,
            onSuccess: onSuccess,
            height: 400
        });
    }
    
    function onSubmit() {
        return true;
    }
    
    function onSuccess() {
        return true;
    }
    
    function search() {
        var dt = $('form').serializeArray();
        var p = {
            url: "http://localhost:8080/tutorial/getCustomers",
            params: dt
        };
        ui.grid.flexOptions(p).flexReload();
    }

    $('form').submit(function () {
        search();
        return false;
    });
});