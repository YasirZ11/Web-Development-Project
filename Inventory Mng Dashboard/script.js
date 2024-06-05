document.addEventListener('DOMContentLoaded', () => {
    // Dummy data for the chart
    const data = {
        labels: ['January', 'February', 'March', 'April', 'May', 'June'],
        datasets: [{
            label: 'Stock Levels',
            data: [100, 90, 80, 70, 60, 50],
            borderColor: 'rgba(128, 0, 128, 1)',
            backgroundColor: 'rgba(0, 0, 0, 1)',
            borderWidth: 1.5
        }]
    };

    const config = {
        type: 'line',
        data: data,
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    };

    const inventoryChart = new Chart(
        document.getElementById('inventoryChart'),
        config
    );

    // User management actions
    document.getElementById('add-user').addEventListener('click', () => {
        alert('Add User functionality not implemented yet.');
    });

    document.querySelectorAll('button').forEach(button => {
        button.addEventListener('click', (e) => {
            if (e.target.textContent === 'Edit') {
                alert('Edit User functionality not implemented yet.');
            } else if (e.target.textContent === 'Delete') {
                alert('Delete User functionality not implemented yet.');
            }
        });
    });
});
